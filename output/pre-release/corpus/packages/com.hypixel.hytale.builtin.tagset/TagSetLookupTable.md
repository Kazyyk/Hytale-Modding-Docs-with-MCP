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

Also in this package: TagSet, TagSetLookup, TagSetPlugin

Complete API:
  private void createTagMap(Map<String,T> tagSetMap, Object2IntMap<String> tagSetIndexMap, Object2IntMap<String> tagIndexMap)
  private IntSet createTagSet(T tagSet, Map<String,T> tagSetMap, Object2IntMap<String> tagSetIndexMap, Object2IntMap<String> tagIndexMap, IntArrayList path)
  private void consumeSet(String tag, Map<String,T> tagSetMap, Object2IntMap<String> tagSetIndexMap, Object2IntMap<String> tagIndexMap, IntArrayList path, Consumer<IntSet> predicate)
  private void consumeTag(String tag, T tagSet, Object2IntMap<String> tagIndexMap, IntConsumer predicate)
  private IntSet getOrCreateTagSet(String identifier, Map<String,T> tagSetMap, Object2IntMap<String> tagSetIndexMap, Object2IntMap<String> tagIndexMap, IntArrayList path)
  public Int2ObjectMap<IntSet> getFlattenedSet()

Fields:
private Int2ObjectMap<IntSet> tagMatcher
