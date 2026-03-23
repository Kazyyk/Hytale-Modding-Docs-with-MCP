# QuerySystem

Type: interface | Package: com.hypixel.hytale.component.system | Extends: ISystem<ECS_TYPE>

public interface QuerySystem<ECS_TYPE> extends ISystem<ECS_TYPE>

## Methods

- default boolean test(ComponentRegistry<ECS_TYPE> componentRegistry, Archetype<ECS_TYPE> archetype)
- @Nullable Query<ECS_TYPE> getQuery()
