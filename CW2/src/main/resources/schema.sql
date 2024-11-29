DROP TABLE registration IF EXISTS;
DROP TABLE grade IF EXISTS;
DROP TABLE student IF EXISTS;
DROP TABLE module IF EXISTS;


CREATE TABLE student (
  id SERIAL PRIMARY KEY,
  firstName VARCHAR(20),
  lastName VARCHAR(20),
  username VARCHAR(20),
  email VARCHAR(50)
);

CREATE TABLE module (
  code VARCHAR(10) PRIMARY KEY,
  name VARCHAR(20),
  mnc BOOLEAN
);

CREATE TABLE registration(
  id SERIAL PRIMARY KEY,
  student_id INT,
  module_code VARCHAR(10),
  FOREIGN KEY (student_id)
    REFERENCES student (id),
  FOREIGN KEY (module_code)
    REFERENCES module (code)
);
  
CREATE TABLE grade(
  id SERIAL PRIMARY KEY,
  student_id INT,
  score INT,
  module_code VARCHAR(10),
  FOREIGN KEY (student_id)
    REFERENCES student (id),
  FOREIGN KEY (module_code)
    REFERENCES module (code)
<<<<<<< HEAD
);
=======
);
>>>>>>> parent of ff9ca13 (#5 add GradeController)
