# UpdateMachinimaScene

Type: class | Package: com.hypixel.hytale.protocol.packets.machinima | Implements: Packet, ToServerPacket, ToClientPacket

public class UpdateMachinimaScene implements Packet, ToServerPacket, ToClientPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public String player
- public String sceneName
- public float frame
- public SceneUpdateType updateType
- public byte[] scene

## Methods

- @Override public int getId()
- @Override public NetworkChannel getChannel()
- @Nonnull public static UpdateMachinimaScene deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public UpdateMachinimaScene clone()
- @Override public boolean equals(Object obj)
- @Override public int hashCode()

Also in this package: RequestMachinimaActorModel, SceneUpdateType, SetMachinimaActorModel

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateMachinimaScene deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateMachinimaScene clone()
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
public String player
public String sceneName
public float frame
public SceneUpdateType updateType
public byte[] scene
