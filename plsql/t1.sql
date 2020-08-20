DECLARE
 message varchar2(100);
BEGIN
  message := 'Hello World';
  dbms_output.put_line(message ||' from PL/SQL  ');
  dbms_output.put_line('HELOOOOOOOOOOOOOOOO');
END;
/
