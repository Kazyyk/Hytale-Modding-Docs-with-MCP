# ForEachTaskData

Type: class | Package: com.hypixel.hytale.component.data | Implements: IntConsumer

public class ForEachTaskData<ECS_TYPE> implements IntConsumer

Utility type in the `data` subsystem.

## Methods

- accept(int index) | void | Instance method.
- clear() | void | Instance method.

Complete API:
  public void init(IntBiObjectConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer, ArchetypeChunk<ECS_TYPE> archetypeChunk, CommandBuffer<ECS_TYPE> commandBuffer)
  public void accept(int index)
  public void clear()
  public static void invokeParallelTask(ParallelTask<ForEachTaskData<ECS_TYPE>> parallelTask, CommandBuffer<ECS_TYPE> commandBuffer)

Fields:
private IntBiObjectConsumer<ArchetypeChunk<ECS_TYPE>,CommandBuffer<ECS_TYPE>> consumer
private ArchetypeChunk<ECS_TYPE> archetypeChunk
private CommandBuffer<ECS_TYPE> commandBuffer
