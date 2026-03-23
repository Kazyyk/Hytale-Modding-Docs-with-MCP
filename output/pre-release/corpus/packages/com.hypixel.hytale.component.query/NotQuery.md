# NotQuery

Type: class | Package: com.hypixel.hytale.component.query | Implements: Query

public class NotQuery<ECS_TYPE> implements Query

## Fields

- private final Query<ECS_TYPE> query

## Methods

- @Override public boolean test(Archetype<ECS_TYPE> archetype)
- @Override public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
- @Override public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
- @Override public void validate()
