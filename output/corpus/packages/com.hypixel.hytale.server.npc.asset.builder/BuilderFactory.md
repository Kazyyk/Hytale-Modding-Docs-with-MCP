# BuilderFactory

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Implements: SchemaConvertable<Void>, NamedSchema

public class BuilderFactory<T> implements SchemaConvertable<Void>, NamedSchema

Factory for creating Builder instances from JSON type discriminators. Each factory manages a map of named builder suppliers for a single category (e.g., Role, Action, Sensor). When reading JSON, the factory looks up the type tag value (default key: `"Type"`) and instantiates the corresponding builder. Every factory automatically registers a `"Component"` builder that creates a BuilderComponent.

## Type Parameters

- T | The runtime type produced by builders in this factory.

## Constants

- DEFAULT_TYPE | String | "Type"
- COMPONENT_TYPE | String | "Component"

## Fields

- typeTag | String | The JSON key used as the type discriminator.
- defaultBuilder | Supplier<Builder<T>> | Optional default builder for when no type tag is present.
- category | Class<T> | The category class.
- buildersSuppliers | Map<String, Supplier<Builder<T>>> | Registered builder suppliers by name.

## Constructors


public BuilderFactory(Class<T> category, String typeTag)
public BuilderFactory(Class<T> category, String typeTag, Supplier<Builder<T>> defaultBuilder)

## Methods

### add


@Nonnull
public BuilderFactory<T> add(String name, Supplier<Builder<T>> builder)

Registers a named builder supplier. Throws if the name is already registered or the type tag is empty.

### getCategory


public Class<T> getCategory()

### createBuilder


public Builder<T> createBuilder(@Nonnull JsonElement config)

Creates a builder from a JSON element by reading the type tag. Falls back to the default builder for non-object elements.


@Nonnull
public Builder<T> createBuilder(String name)

Creates a builder by name. Validates the category matches.

### tryCreateDefaultBuilder


@Nullable
public Builder<T> tryCreateDefaultBuilder()

Returns a new default builder instance, or `null` if none is configured.

### getKeyName


public String getKeyName(@Nonnull JsonElement config)

Extracts the type tag value from a JSON element without creating a builder.

### getBuilderNames


@Nonnull
public List<String> getBuilderNames()

Returns all registered builder names.

### getSchemaName


@Nonnull
@Override
public String getSchemaName()

Returns `"NPCType:" + category.getSimpleName()`.

### toSchema


@Nonnull
@Override
public Schema toSchema(@Nonnull SchemaContext context)

Generates a conditional JSON Schema where the `if/then/else` structure selects the correct builder schema based on the type tag value.

## Related Types

- Builder -- the interface of created objects
- BuilderComponent -- default `"Component"` builder
- BuilderManager -- registers and retrieves factories
