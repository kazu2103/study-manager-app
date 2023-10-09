import { Control, Controller, Path, RegisterOptions } from 'react-hook-form';
import { TextInput } from 'react-native-paper';

export interface FormTextInputControllerProps<T> {
  control: Control<T>;
  name: Path<T>;
  rules: Omit<RegisterOptions<T, Path<T>>, 'valueAsNumber' | 'valueAsDate' | 'setValueAs' | 'disabled'>;
  placeholder?: string;
}

const FormTextInputController = <T,>({
  control,
  name,
  rules,
  placeholder,
}: FormTextInputControllerProps<T>) => (
  <Controller
    control={control}
    rules={rules}
    render={({ field: { onChange, onBlur, value } }) => (
      <TextInput
        onBlur={onBlur}
        onChangeText={onChange}
        placeholder={placeholder}
      />
    )}
    name={name}
  />
);

export default FormTextInputController;