import { Controller, useForm } from 'react-hook-form';
import { View } from 'react-native';
import { Button, TextInput } from 'react-native-paper';
import FormTextInputController from '../components/form/FormTextInputController';
import FormSubmitButton from '../components/form/FormSubmitButton';

const units = [
  '時間',
  'ページ',
  '章',
  '節',
  '問',
  '個',
  '枚',
] as const;

export type Unit = typeof units[number];

export interface ObjectiveCategory {
  id: string;
  name: string;
  description: string;
}

export interface ObjectiveFormProps {
  name: string;
  category: ObjectiveCategory;
  unit: Unit,
  progressOfUnit: number;
}

const ObjectiveSetting = () => {

  const { handleSubmit, control } = useForm<ObjectiveFormProps>();

  const onSubmit = (data: ObjectiveFormProps) => {
    console.log(data);
  }

  return (
    <View>
      <FormTextInputController
        control={control}
        name='name'
        rules={{
          required: true,
        }}
        placeholder='目標名'
      />
      
      <FormTextInputController
        control={control}
        name='category'
        rules={{
          required: true,
        }}
      />
      <FormSubmitButton
        text='目標を設定する'
        onPress={handleSubmit(onSubmit)}
      />
      
    </View>
  )
}

export default ObjectiveSetting;