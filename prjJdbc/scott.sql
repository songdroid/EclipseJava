select * from EMP;

/*
* 급여, 부서, 업무를 입력받아 검색한다.
* 이때 급여는 같거나 크고, 부서와 업무가 같은 직원의
* 사번, 이름, 업무, 부서번호, 급여, 입사일자 조회
*/

SELECT empno, ename, sal, job, deptno, hiredate FROM EMP
WHERE sal>=1500 AND deptno=30 AND job='SALESMAN';