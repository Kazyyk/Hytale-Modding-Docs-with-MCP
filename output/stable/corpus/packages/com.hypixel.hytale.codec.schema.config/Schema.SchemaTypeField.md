# Schema.SchemaTypeField

Type: class | Package: com.hypixel.hytale.codec.schema.config

public static class Schema.SchemaTypeField

Configures a type discriminator field for the `hytaleSchemaTypeField` key. Used to define which property acts as a type selector, its default value, allowed values, and an optional parent property key for hierarchical discrimination.

## Codec Properties

- property | String | The property name used as the type discriminator.
- defaultValue | String | Default value when the discriminator is absent.
- values | String[] | Allowed values for the discriminator.
- parentPropertyKey | String | Parent property key for hierarchical type fields.

## Constructors


public SchemaTypeField(String property, String defaultValue, String... values)


protected SchemaTypeField()

## Methods


public String getProperty()


public String getDefaultValue()


public String[] getValues()


public String getParentPropertyKey()


public void setParentPropertyKey(String parentPropertyKey)


@Override
public boolean equals(Object o)


@Override
public int hashCode()

## See Also

- Schema -- parent class
