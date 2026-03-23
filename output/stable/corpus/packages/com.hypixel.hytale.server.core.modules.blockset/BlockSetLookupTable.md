# BlockSetLookupTable

Type: class | Package: com.hypixel.hytale.server.core.modules.blockset

public class BlockSetLookupTable

## Fields

- @Nonnull private final Object2ObjectMap<String, IntSet> blockNameIdMap
- @Nonnull private final Object2ObjectMap<String, IntSet> groupNameIdMap
- @Nonnull private final Object2ObjectMap<String, IntSet> hitboxNameIdMap
- @Nonnull private final Object2ObjectMap<String, IntSet> categoryIdMap

## Constructors

- public BlockSetLookupTable(@Nonnull Map<String, BlockType> blockTypeMap)

## Methods

- public void addAll(@Nonnull IntSet result)
- @Nonnull public Object2ObjectMap<String, IntSet> getBlockNameIdMap()
- @Nonnull public Object2ObjectMap<String, IntSet> getGroupNameIdMap()
- @Nonnull public Object2ObjectMap<String, IntSet> getHitboxNameIdMap()
- @Nonnull public Object2ObjectMap<String, IntSet> getCategoryIdMap()
- public boolean isEmpty()
