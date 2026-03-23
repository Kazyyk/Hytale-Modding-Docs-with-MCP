# Schema.InheritSettings

Type: class | Package: com.hypixel.hytale.codec.schema.config

public static class Schema.InheritSettings

Configures parent schema inheritance for the `hytaleParent` key. Defines the parent type and optional map-based lookup for determining the parent schema to inherit from.

## Codec Properties

- type | String | The parent schema type identifier.
- mapKey | String | The property key used for map-based parent lookup.
- mapKeyValue | String | The expected value of the map key property.

## Constructors


public InheritSettings(String type)


protected InheritSettings()

## Methods


public String getType()


public void setType(String type)


public String getMapKey()


public void setMapKey(String mapKey)


public String getMapKeyValue()


public void setMapKeyValue(String mapKeyValue)


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## See Also

- Schema -- parent class

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, BooleanSchema, CommonAsset, DoubleOrSchema, HytaleMetadata, IntegerOrSchema, IntegerSchema, ItemOrItems, NullSchema, NumberSchema, ObjectSchema, Schema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public String getType()
  public void setType(String type)
  public String getMapKey()
  public void setMapKey(String mapKey)
  public String getMapKeyValue()
  public void setMapKeyValue(String mapKeyValue)
  public boolean equals(Object o)
  public int hashCode()

Fields:
public static final BuilderCodec<Schema.InheritSettings> CODEC
private String type
private String mapKey
private String mapKeyValue
