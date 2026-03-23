# TagSetLookupTable

Type: class | Package: com.hypixel.hytale.builtin.tagset | Extends: TagSet>

public class TagSetLookupTable<T extends TagSet>

Concrete implementation extending `TagSet>`.

## Constructors

- TagSetLookupTable(@Nonnull Map<String, T> tagSetMap, @Nonnull Object2IntMap<String> tagSetIndexMap, @Nonnull Object2IntMap<String> tagIndexMap) | Creates a new TagSetLookupTable instance.

## Methods

- createTagMap(@Nonnull Map<String, T> tagSetMap, @Nonnull Object2IntMap<String> tagSetIndexMap, @Nonnull Object2IntMap<String> tagIndexMap) | void | private method.
- consumeTag(@Nonnull String tag, @Nonnull T tagSet, @Nonnull Object2IntMap<String> tagIndexMap, @Nonnull IntConsumer predicate) | void | private method.
- getFlattenedSet() | Int2ObjectMap<IntSet> | public method.
