# EntityDataSystem

Type: class | Package: com.hypixel.hytale.component.system.data | Extends: ArchetypeDataSystem<ECS_TYPE, Q, R>

public abstract class EntityDataSystem<ECS_TYPE, Q, R> extends ArchetypeDataSystem<ECS_TYPE, Q, R>

Abstract ECS data system that iterates individual entities within archetype chunks. Supports optional parallel execution via `isParallel()`. When parallel, uses the `ParallelTask` infrastructure to fork command buffers and merge results. Contains the inner `SystemTaskData` class for parallel task state.

## Methods

- isParallel() | boolean | Returns whether this system processes entities in parallel. Default false.
- fetch(ArchetypeChunk<ECS_TYPE> archetypeChunk, Store<ECS_TYPE> store, CommandBuffer<ECS_TYPE> commandBuffer, Q query, List<R> results) | void | Dispatches to per-entity iteration, optionally in parallel.
- fetch(int var1, ArchetypeChunk<ECS_TYPE> var2, Store<ECS_TYPE> var3, CommandBuffer<ECS_TYPE> var4, Q var5, List<R> var6) | void | Abstract. Processes a single entity at the given index.
- doFetch(@Nonnull EntityDataSystem<ECS_TYPE, Q, R> system, @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk, @Nonnull Store<ECS_TYPE> store, @Nonnull CommandBuffer<ECS_TYPE> commandBuffer, Q query, List<R> results) | void | Static. Core iteration logic — branches between parallel and sequential paths.

## Inner Classes

- SystemTaskData<ECS_TYPE, Q, R> | Holds per-task state for parallel entity processing. Implements `IntConsumer` to process entity indices.
