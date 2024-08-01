package ru.gb.oseminar.data;

import java.util.List;

public class StreamService {
public List<Stream> sortSream(List<Stream> stream) {
    stream.sort(new StreamComparator());
    return stream;
}
}
