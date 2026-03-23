# UICommandBuilder

Type: class | Package: com.hypixel.hytale.server.core.ui.builder

public class UICommandBuilder

Fluent builder for constructing sequences of `CustomUICommand` packets sent to the client to manipulate custom UI documents. Supports DOM-like operations: clear, remove, append, insert-before, and setting values of various types (string, boolean, int, float, double, `Message`, arrays, lists, and codec-registered objects). Registered codec types include `Area`, `ItemGridSlot`, `ItemStack`, `LocalizableString`, `PatchStyle`, `DropdownEntryInfo`, and `Anchor`.

## Fields

- EMPTY_COMMAND_ARRAY | CustomUICommand[] | Empty array constant for no-op command lists.

## Methods

- clear(String selector) | UICommandBuilder | Appends a Clear command for the given selector.
- remove(String selector) | UICommandBuilder | Appends a Remove command.
- append(String documentPath) | UICommandBuilder | Appends an Append command (no selector).
- append(String selector, String documentPath) | UICommandBuilder | Appends an Append command under the given selector.
- appendInline(String selector, String document) | UICommandBuilder | Appends inline document content.
- insertBefore(String selector, String documentPath) | UICommandBuilder | Inserts a document before the selected element.
- insertBeforeInline(String selector, String document) | UICommandBuilder | Inserts inline content before the selected element.
- set(String selector, @Nonnull Value<T> ref) | UICommandBuilder | Sets a value reference (must not have a direct value).
- setNull(String selector) | UICommandBuilder | Sets the selected element to null.
- set(String selector, @Nonnull String str) | UICommandBuilder | Sets a string value.
- set(String selector, @Nonnull Message message) | UICommandBuilder | Sets a `Message` value.
- set(String selector, boolean b) | UICommandBuilder | Sets a boolean value.
- set(String selector, float n) | UICommandBuilder | Sets a float value.
- set(String selector, int n) | UICommandBuilder | Sets an integer value.
- set(String selector, double n) | UICommandBuilder | Sets a double value.
- setObject(String selector, @Nonnull Object data) | UICommandBuilder | Sets a value using a registered codec.
- set(String selector, @Nonnull T[] data) | UICommandBuilder | Sets an array value using registered codecs.
- set(String selector, @Nonnull List<T> data) | UICommandBuilder | Sets a list value using registered codecs.
- getCommands() | CustomUICommand[] | Returns the built command array.

Also in this package: EventData, UIEventBuilder

Complete API:
  public UICommandBuilder clear(String selector)
  public UICommandBuilder remove(String selector)
  public UICommandBuilder append(String documentPath)
  public UICommandBuilder append(String selector, String documentPath)
  public UICommandBuilder appendInline(String selector, String document)
  public UICommandBuilder insertBefore(String selector, String documentPath)
  public UICommandBuilder insertBeforeInline(String selector, String document)
  private UICommandBuilder setBsonValue(String selector, BsonValue bsonValue)
  public UICommandBuilder set(String selector, Value<T> ref)
  public UICommandBuilder setNull(String selector)
  public UICommandBuilder set(String selector, String str)
  public UICommandBuilder set(String selector, Message message)
  public UICommandBuilder set(String selector, boolean b)
  public UICommandBuilder set(String selector, float n)
  public UICommandBuilder set(String selector, int n)
  public UICommandBuilder set(String selector, double n)
  public UICommandBuilder setObject(String selector, Object data)
  public UICommandBuilder set(String selector, T[] data)
  public UICommandBuilder set(String selector, List<T> data)
  public CustomUICommand[] getCommands()

Fields:
private static final Map<Class,Codec> CODEC_MAP
public static final CustomUICommand[] EMPTY_COMMAND_ARRAY
private final List<CustomUICommand> commands
