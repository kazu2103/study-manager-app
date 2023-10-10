import { Control, Controller, Path, RegisterOptions } from 'react-hook-form';
import { TextInputProps } from 'react-native';
import { TextInput } from 'react-native-paper';

export type FormTextInputControllerProps = {
  control: Control;
  name: string;
  rules: any;
} & TextInputProps

const FormTextInputController = ({
  control,
  name,
  rules,
  ...textInputProps
}: FormTextInputControllerProps) => (
  <Controller
    control={control}
    rules={rules}
    render={({ field: { onChange, onBlur, value } }) => (
      <TextInput
        onBlur={onBlur}
        onChangeText={onChange}
        placeholder={textInputProps.placeholder}
      />
    )}
    name={name}
  />
);

export default FormTextInputController;