# OrQuery

Type: class | Package: com.hypixel.hytale.component.query | Implements: Query

public class OrQuery<ECS_TYPE> implements Query

## Fields

- private final Query<ECS_TYPE>[] queries

## Methods

- @Override public boolean test(Archetype<ECS_TYPE> archetype)
- @Override public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
- @Override public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
- @Override public void validate()

Also in this package: AndQuery, AnyQuery, ExactArchetypeQuery, NotQuery, Query, ReadWriteArchetypeQuery

Complete API:
  public boolean test(Archetype<ECS_TYPE> archetype)
  public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()

Fields:
private final Query<ECS_TYPE>[] queries
