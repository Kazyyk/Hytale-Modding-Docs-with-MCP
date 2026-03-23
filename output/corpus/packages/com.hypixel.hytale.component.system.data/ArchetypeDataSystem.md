# ArchetypeDataSystem

Type: class | Package: com.hypixel.hytale.component.system.data | Extends: System<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class ArchetypeDataSystem<ECS_TYPE, Q, R> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>

Abstract base for ECS systems that query archetype chunks and produce typed results. Parameterized by the ECS store type, a query type `Q`, and a result type `R`. Subclasses implement `fetch` to process each archetype chunk.

## Methods

- fetch(ArchetypeChunk<ECS_TYPE> var1, Store<ECS_TYPE> var2, CommandBuffer<ECS_TYPE> var3, Q var4, List<R> var5) | void | Abstract. Processes an archetype chunk with the given query, appending results to the list.
