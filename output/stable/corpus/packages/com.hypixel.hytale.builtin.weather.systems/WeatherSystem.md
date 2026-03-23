# WeatherSystem

Type: class | Package: com.hypixel.hytale.builtin.weather.systems

public class WeatherSystem

## Methods

- @Override public ComponentType<EntityStore, Teleport> componentType()
- public void onComponentAdded(@Nonnull Ref<EntityStore> ref, @Nonnull Teleport component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- public void onComponentSet(@Nonnull Ref<EntityStore> ref,
            @Nullable Teleport oldComponent,
            @Nonnull Teleport newComponent,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `` | `public void` | `onComponentRemoved(@Nonnull Ref<EntityStore> ref, @Nonnull Teleport component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `Query<EntityStore>` | `getQuery()` |
| `@Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `void` | `onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` |
| `` | `throw new` | `IllegalArgumentException("Unknown key! " + key)` |
| `@Override public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `@Override public` | `void` | `tick(float dt,
            int index,
            @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `void` | `onSystemAddedToStore(@Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onSystemRemovedFromStore(@Nonnull Store<EntityStore> store)` |
