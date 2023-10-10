import { useState } from 'react';
import { Control, Controller, Path, RegisterOptions } from 'react-hook-form';
import { Button, Text, TouchableOpacity } from 'react-native';
import { Menu } from 'react-native-paper';
import { ObjectiveCategory, Unit } from '../../pages/ObjectiveSetting';

export type FormMenuControllerProps = {
  control: Control;
  name: string;
  rules: any;
  menuItems: string[];
} & typeof Menu.defaultProps

const FormMenuController = ({
  control,
  name,
  rules,
  menuItems,
}: FormMenuControllerProps) => {
  const [visible, setVisible] = useState(false);

  
  return (
    <Controller
      control={control}
      rules={rules}
      render={({ field: { onChange, value } }) => (
        <Menu
          visible={visible}
          onDismiss={() => setVisible(false)}
          anchor={
            <TouchableOpacity
              onPress={() => setVisible(true)}
            >
              <Text>
                {value || 'Select Item'}
              </Text>
            </TouchableOpacity>
          }
        >
          {menuItems.map((item) => (
            <Menu.Item
              key={item}
              onPress={() => { onChange(item); setVisible(false); }}
              title={item}
            />
          ))}
        </Menu>
      )}
      name={name}
    />
  );
};

export default FormMenuController;