package lesson3;

//* ������� ������� {"�","�","�","�"}
//* ������ ��������� ��� ��������� ���������� 4�-����������
//*  ���� � ���������� ������� �� ������ ����
//* ������ ����� �� ����� ������� (�� �����) ����� ����� "����"
//* ������ ������:
//*  1) ����
//*  2) ����
//*  3) ����
//*  4) ����
//*  5) ����
public class Main2 {
    public static void main(String[] args) {
        String[] letters = {"�","�","�","�"};
        int count = 1;
        int searchNum = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                for (int k = 0; k < letters.length; k++) {
                    for (int l = 0; l < letters.length; l++) {
                        String word = letters[i]+letters[j]+letters[k]+letters[l];
                        if (word.equals("����"))searchNum =count;

                        System.out.println((count++)+ ")"+word);

                    }
                    System.out.println("������� ����� ���� ������� �� �������:" +searchNum);
                }

                        //void -������ �� ������
                        // int - �������� ���������� �����  
            }


        }

    }
}
