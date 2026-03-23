# EditorBlocksChange

Type: class | Package: com.hypixel.hytale.protocol.packets.interface_ | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class EditorBlocksChange implements Packet, ToClientPacket

Server-to-client packet that transmits editor block, fluid, and entity changes. Carries an optional `EditorSelection`, arrays of `BlockChange`, `FluidChange`, and `ClipboardEntityChange` entries, a total blocks count, and flags controlling advanced preview and preview rebuild behavior. The packet is compressed and uses nullable bit fields to omit absent arrays.

## Protocol Constants

- PACKET_ID | 222
- IS_COMPRESSED | true
- MAX_SIZE | 1677721600

## Fields

- selection | EditorSelection | yes | The editor selection region
- blocksChange | BlockChange[] | yes | Array of block changes (max 4,096,000)
- fluidsChange | FluidChange[] | yes | Array of fluid changes (max 4,096,000)
- entityChanges | ClipboardEntityChange[] | yes | Array of entity changes (max 4,096,000)
- blocksCount | int | no | Total number of blocks affected
- advancedPreview | boolean | no | Whether advanced preview is enabled
- skipPreviewRebuild | boolean | no | Whether to skip rebuilding the preview

## Methods


@Override
public int getId()

Returns the packet ID (`222`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static EditorBlocksChange deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes an `EditorBlocksChange` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the number of bytes consumed by this packet in the buffer.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.


public EditorBlocksChange clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- `EditorSelection` -- selection region data
- `BlockChange` -- individual block change entry
- `FluidChange` -- individual fluid change entry
- `ClipboardEntityChange` -- entity change entry from clipboard operations

Also in this package: AddToServerPlayerList, BlockChange, ChatMessage, ChatTagType, ChatType, CustomHud, CustomPage, CustomPageEvent, CustomPageEventType, CustomPageLifetime, CustomUICommand, CustomUICommandType, CustomUIEventBinding, CustomUIEventBindingType, EditorSelection, FluidChange, HideEventTitle, HudComponent, KillFeedMessage, Notification (and 21 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static EditorBlocksChange deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EditorBlocksChange clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public EditorSelection selection
public BlockChange[] blocksChange
public FluidChange[] fluidsChange
public ClipboardEntityChange[] entityChanges
public int blocksCount
public boolean advancedPreview
public boolean skipPreviewRebuild
