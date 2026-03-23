# StringSchema.CommonAsset

Type: class | Package: com.hypixel.hytale.codec.schema.config

public static class StringSchema.CommonAsset

Configuration for common asset file references within a StringSchema. Specifies required root directories, file extension, and whether the asset is a UI asset.

## Codec Properties

- requiredRoots | String[] | Required root directories the asset path must start with.
- requiredExtension | String | Required file extension (e.g., `".png"`).
- isUIAsset | boolean | Whether this references a UI asset.

## Constructors


public CommonAsset(String requiredExtension, boolean isUIAsset, String... requiredRoots)


protected CommonAsset()

## Methods


public String[] getRequiredRoots()


public String getRequiredExtension()


public boolean isUIAsset()

## See Also

- StringSchema -- parent class

Known subclasses: FileCommonAsset, ResourceCommonAsset

Also in this package: ArrayOrNull, ArraySchema, BooleanOrSchema, BooleanSchema, DoubleOrSchema, HytaleMetadata, InheritSettings, IntegerOrSchema, IntegerSchema, ItemOrItems, NullSchema, NumberSchema, ObjectSchema, Schema, SchemaTypeField, StringOrBlank, StringSchema

Complete API:
  public String[] getRequiredRoots()
  public String getRequiredExtension()
  public boolean isUIAsset()

Fields:
public static final BuilderCodec<StringSchema.CommonAsset> CODEC
private String[] requiredRoots
private String requiredExtension
private boolean isUIAsset
