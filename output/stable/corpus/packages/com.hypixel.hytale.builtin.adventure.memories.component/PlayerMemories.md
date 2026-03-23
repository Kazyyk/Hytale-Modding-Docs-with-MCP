# PlayerMemories

Type: class | Package: com.hypixel.hytale.builtin.adventure.memories.component | Implements: Component

public class PlayerMemories implements Component<EntityStore>

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

- getComponentType() | ComponentType<EntityStore, PlayerMemories> | Accessor method.
- getMemoriesCapacity() | int | Accessor method.
- setMemoriesCapacity(int memoriesCapacity) | void | Mutator method.
- hasMemories() | boolean | Boolean accessor.
- getRecordedMemories() | Set<Memory> | Accessor method.

## Methods

- recordMemory(Memory memory) | boolean | Instance method.
- takeMemories(Set<Memory> outMemories) | boolean | Instance method.

Complete API:
  public static ComponentType<EntityStore,PlayerMemories> getComponentType()
  public Component<EntityStore> clone()
  public int getMemoriesCapacity()
  public void setMemoriesCapacity(int memoriesCapacity)
  public boolean recordMemory(Memory memory)
  public boolean hasMemories()
  public boolean takeMemories(Set<Memory> outMemories)
  public Set<Memory> getRecordedMemories()

Fields:
public static final BuilderCodec<PlayerMemories> CODEC
private final Set<Memory> memories
private int memoriesCapacity
