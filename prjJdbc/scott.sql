select * from EMP;

/*
* �޿�, �μ�, ������ �Է¹޾� �˻��Ѵ�.
* �̶� �޿��� ���ų� ũ��, �μ��� ������ ���� ������
* ���, �̸�, ����, �μ���ȣ, �޿�, �Ի����� ��ȸ
*/

SELECT empno, ename, sal, job, deptno, hiredate FROM EMP
WHERE sal>=1500 AND deptno=30 AND job='SALESMAN';