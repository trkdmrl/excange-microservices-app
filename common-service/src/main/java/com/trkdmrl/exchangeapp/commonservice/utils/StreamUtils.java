package com.trkdmrl.exchangeapp.commonservice.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public final class StreamUtils {

    private StreamUtils() {

    }

    public static <T> Stream<T> asStream(final Collection<T> collection) {
        return Optional.ofNullable(collection).orElse(Collections.emptyList()).stream();
    }

}
