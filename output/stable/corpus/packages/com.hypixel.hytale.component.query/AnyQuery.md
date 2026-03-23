# AnyQuery

Type: class | Package: com.hypixel.hytale.component.query | Implements: Query

public class AnyQuery<ECS_TYPE> implements Query

## Fields

- static final AnyQuery<?> INSTANCE

## Methods

- @Override public boolean test(Archetype<ECS_TYPE> archetype)
- @Override public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
- @Override public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
- @Override public void validate()

Also in this package: AndQuery, ExactArchetypeQuery, NotQuery, OrQuery, Query, ReadWriteArchetypeQuery

Complete API:
  public boolean test(Archetype<ECS_TYPE> archetype)
  public boolean requiresComponentType(ComponentType<ECS_TYPE,?> componentType)
  public void validateRegistry(ComponentRegistry<ECS_TYPE> registry)
  public void validate()

Fields:
static final AnyQuery<?> INSTANCE
