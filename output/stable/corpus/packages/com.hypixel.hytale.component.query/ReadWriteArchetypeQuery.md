# ReadWriteArchetypeQuery

Type: interface | Package: com.hypixel.hytale.component.query | Implements: Query

public interface ReadWriteArchetypeQuery<ECS_TYPE> extends Query

## Methods

- Archetype<ECS_TYPE> getReadArchetype()
- Archetype<ECS_TYPE> getWriteArchetype()
- @Override default boolean test(Archetype<ECS_TYPE> archetype)
- @Override default boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
- @Override default void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
- @Override default void validate()
