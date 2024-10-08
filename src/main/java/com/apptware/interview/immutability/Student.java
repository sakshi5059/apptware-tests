/** This class is expected to be immutable. Please make necessary changes. */
package com.apptware.interview.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

public final class Student {
  private final String name;
  private final Date dateOfBirth;
  private final List<String> courses;

  public Student(String name, Date dateOfBirth, List<String> courses) {
    this.name = name;
    this.dateOfBirth = new Date(dateOfBirth.getTime());
    this.courses = new ArrayList<>(courses);
  }


  public Date getDateOfBirth() {

    return new Date(dateOfBirth.getTime());
  }

  public List<String> getCourses() {
    return Collections.unmodifiableList(courses);
  }
}
