# Query

Type: interface | Package: com.hypixel.hytale.component.query

public interface Query<ECS_TYPE>

## Methods

- @Nonnull static AnyQuery<ECS_TYPE> any()
- @Nonnull static NotQuery<ECS_TYPE> not(Query<ECS_TYPE> query)
- @Nonnull @SafeVarargs static AndQuery<ECS_TYPE> and(Query<ECS_TYPE> queries)
- @Nonnull @SafeVarargs static OrQuery<ECS_TYPE> or(Query<ECS_TYPE> queries)
- boolean test(Archetype<ECS_TYPE> var1)
- boolean requiresComponentType(ComponentType<ECS_TYPE,?> var1)
- void validateRegistry(ComponentRegistry<ECS_TYPE> var1)
- void validate()

Known implementors: AllLegacyEntityTypesQuery, AllLegacyLivingEntityTypesQuery, AndQuery, AnyQuery, Archetype, ComponentType, ExactArchetypeQuery, NotQuery, OrQuery, ReadWriteArchetypeQuery

Also in this package: AndQuery, AnyQuery, ExactArchetypeQuery, NotQuery, OrQuery, ReadWriteArchetypeQuery

Complete API:
  static AnyQuery<ECS_TYPE> any()
  static NotQuery<ECS_TYPE> not(Query<ECS_TYPE> query)
  static AndQuery<ECS_TYPE> and(Query<ECS_TYPE> queries)
  static OrQuery<ECS_TYPE> or(Query<ECS_TYPE> queries)
  boolean test(Archetype<ECS_TYPE> var1)
  boolean requiresComponentType(ComponentType<ECS_TYPE,?> var1)
  void validateRegistry(ComponentRegistry<ECS_TYPE> var1)
  void validate()
