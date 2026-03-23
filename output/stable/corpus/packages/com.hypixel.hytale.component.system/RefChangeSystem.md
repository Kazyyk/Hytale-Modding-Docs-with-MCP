# RefChangeSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: Component<ECS_TYPE>> extends System<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class RefChangeSystem<ECS_TYPE, T extends Component<ECS_TYPE>> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>

## Methods

- @Nonnull public abstract ComponentType<ECS_TYPE, T> componentType()
- public abstract void onComponentAdded(@Nonnull Ref<ECS_TYPE> var1, @Nonnull T var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)
- public abstract void onComponentSet(@Nonnull Ref<ECS_TYPE> var1, @Nullable T var2, @Nonnull T var3, @Nonnull Store<ECS_TYPE> var4, @Nonnull CommandBuffer<ECS_TYPE> var5)
- public abstract void onComponentRemoved(@Nonnull Ref<ECS_TYPE> var1, @Nonnull T var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)
