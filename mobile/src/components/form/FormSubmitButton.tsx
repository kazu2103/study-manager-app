import { Button } from 'react-native-paper';

export interface FormSubmitButtonProps {
  text: string;
  onPress: () => void;
}

const FormSubmitButton = ({
  text,
  onPress,
}: FormSubmitButtonProps) => (
  <Button onPress={onPress}>{text}</Button>
);

export default FormSubmitButton;