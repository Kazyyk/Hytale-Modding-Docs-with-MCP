# MemoryProvider

Type: abstract class | Package: com.hypixel.hytale.builtin.adventure.memories.memories

public abstract class MemoryProvider<T extends Memory>

Abstract base type in the MemoryProvider hierarchy.

## Accessors

- getId() | String | Accessor method.
- getCodec() | BuilderCodec<T> | Accessor method.
- getCollectionRadius() | double | Accessor method.
- getAllMemories() | abstract Map<String, Set<Memory>> | Accessor method.

Known subclasses: NPCMemoryProvider

Also in this package: Memory

Complete API:
  public String getId()
  public BuilderCodec<T> getCodec()
  public double getCollectionRadius()
  public abstract Map<String,Set<Memory>> getAllMemories()

Fields:
private final String id
private final BuilderCodec<T> codec
private final double defaultRadius
