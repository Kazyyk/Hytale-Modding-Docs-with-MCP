# LocalizableString

Type: class | Package: com.hypixel.hytale.server.core.ui

public class LocalizableString

## Fields

- public static final LocalizableString.LocalizableStringCodec CODEC
- public static final BuilderCodec<LocalizableString> MESSAGE_OBJECT_CODEC
- private String stringValue
- private String messageId
- private Map<String, String> messageParams

## Methods

- @Nonnull public static LocalizableString fromString(String str)
- @Nonnull public static LocalizableString fromMessageId(String messageId)
- @Nonnull public static LocalizableString fromMessageId(String messageId, Map<String, String> params)

## Inner Types

- `LocalizableString.LocalizableStringCodec`

Also in this package: Anchor, Area, DropdownEntryInfo, ItemGridSlot, LocalizableStringCodec, PatchStyle, Value, ValueCodec

Complete API:
  public static LocalizableString fromString(String str)
  public static LocalizableString fromMessageId(String messageId)
  public static LocalizableString fromMessageId(String messageId, Map<String,String> params)

Fields:
public static final LocalizableString.LocalizableStringCodec CODEC
public static final BuilderCodec<LocalizableString> MESSAGE_OBJECT_CODEC
private String stringValue
private String messageId
private Map<String,String> messageParams
