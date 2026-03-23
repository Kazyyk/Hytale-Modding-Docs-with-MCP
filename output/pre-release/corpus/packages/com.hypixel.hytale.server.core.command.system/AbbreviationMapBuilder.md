# AbbreviationMap.AbbreviationMapBuilder

Type: class | Package: com.hypixel.hytale.server.core.command.system | Extends: java.lang.Object

public static class AbbreviationMap.AbbreviationMapBuilder<Value>

Builder for `AbbreviationMap` instances. Allows registering string keys mapped to values, then builds an immutable `AbbreviationMap` that supports exact, prefix, and substring matching.

## Methods


@Nonnull
public AbbreviationMap.AbbreviationMapBuilder<Value> put(@Nonnull String key, @Nonnull Value value)

Associates a key with a value. Keys are stored in lowercase. Throws `IllegalArgumentException` if the key already exists.


@Nonnull
public AbbreviationMap<Value> build()

Builds and returns the immutable `AbbreviationMap`.

## Related Types

- `AbbreviationMap` -- the map type this builds
