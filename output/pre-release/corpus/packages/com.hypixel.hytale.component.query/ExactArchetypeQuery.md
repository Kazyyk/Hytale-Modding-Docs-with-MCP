# ExactArchetypeQuery

Type: class | Package: com.hypixel.hytale.component.query | Implements: Query

public class ExactArchetypeQuery<ECS_TYPE> implements Query

## Fields

- private final Archetype<ECS_TYPE> archetype

## Methods

- public Archetype<ECS_TYPE> getArchetype()
- @Override public boolean test(Archetype<ECS_TYPE> archetype)
- @Override public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
- @Override public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
- @Override public void validate()

Also in this package: AndQuery, AnyQuery, NotQuery, OrQuery, Query, ReadWriteArchetypeQuery

Complete API:
  public Archetype<ECS_TYPE> getArchetype()
  public boolean test(Archetype<ECS_TYPE> archetype)
  public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()

Fields:
private final Archetype<ECS_TYPE> archetype
