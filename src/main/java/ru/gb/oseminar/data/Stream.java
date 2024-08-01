package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
private String StreamName;
private List<StudentGroup> groups;

public Stream(String StreamName, List<StudentGroup> groups){
this.StreamName = StreamName;
this.groups = groups;
}


    public String getStreamName() {
        return this.StreamName;
    }

    public List<StudentGroup> getGroups() {
        return this.groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
    
}
