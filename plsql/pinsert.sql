DECLARE
 v_deptno dept.deptno%TYPE :=&deptno;
 v_dname dept.dname%TYPE  := &dname;
 v_loc dept.loc%TYPE := &loc;
BEGIN

  insert into dept values (v_deptno, v_dname,v_loc);
  dbms_output.put_line('Inserted ...');
END;
/