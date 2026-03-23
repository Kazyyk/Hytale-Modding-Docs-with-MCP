# MemoryProvider

Type: abstract class | Package: com.hypixel.hytale.builtin.adventure.memories.memories

public abstract class MemoryProvider<T extends Memory>

Abstract base type in the MemoryProvider hierarchy.

## Accessors

- getId() | String | Accessor method.
- getCodec() | BuilderCodec<T> | Accessor method.
- getCollectionRadius() | double | Accessor method.
- getAllMemories() | abstract Map<String, Set<Memory>> | Accessor method.
