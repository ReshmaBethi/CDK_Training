DECLARE
 v_deptno dept.deptno%TYPE :=&deptno;
 v_dname dept.dname%TYPE  := &dname;
 v_loc dept.loc%TYPE := &loc;
BEGIN
  update dept set dept.dname=v_dname,dept.loc=v_loc where dept.deptno=v_deptno;
  dbms_output.put_line('Modified************************...');
END;
/
