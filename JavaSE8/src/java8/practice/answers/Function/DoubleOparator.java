package java8.practice.answers.Function;

// 1. �֐��C���^�[�t�F�[�X�̃A�m�e�[�V������t�^���܂��傤
@FunctionalInterface
// 2. DoubleOperator�C���^�[�t�F�[�X��錾���Ă�������
public interface DoubleOparator {
// 3. double�^�̈�����2�擾���� apply ���\�b�h��錾���Ă�������
	public double apply (double x , double y); 
}
