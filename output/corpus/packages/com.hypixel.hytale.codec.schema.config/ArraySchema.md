# ArraySchema

Type: class | Package: com.hypixel.hytale.codec.schema.config | Extends: com.hypixel.hytale.codec.schema.config.Schema

public class ArraySchema extends Schema

Schema node for the JSON Schema `"array"` type. Extends Schema with array-specific keywords: `items` (single schema or tuple of schemas), `minItems`, `maxItems`, and `uniqueItems`.

## Codec Properties

Inherits all codec properties from Schema, plus:

- items | Schema` or `Schema[] | Schema for array items (single or tuple).
- minItems | Integer | Minimum number of items.
- maxItems | Integer | Maximum number of items.
- uniqueItems | Boolean | Whether items must be unique.

## Constructors


public ArraySchema()


public ArraySchema(Schema item)

## Methods


@Nullable
public Object getItems()


public void setItem(Schema items)

Sets a single item schema.


public void setItems(Schema... items)

Sets a tuple of item schemas.


@Nullable
public Integer getMinItems()


public void setMinItems(Integer minItems)


@Nullable
public Integer getMaxItems()


public void setMaxItems(Integer maxItems)


public boolean getUniqueItems()


public void setUniqueItems(boolean uniqueItems)


@Override
public boolean equals(@Nullable Object o)


@Override
public int hashCode()

## See Also

- Schema -- base class
