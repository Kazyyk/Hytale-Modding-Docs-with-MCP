# MaterialQuantity

Type: class | Package: com.hypixel.hytale.server.core.inventory | Implements: NetworkSerializable<com.hypixel.hytale.protocol.MaterialQuantity>

public class MaterialQuantity implements NetworkSerializable<com.hypixel.hytale.protocol.MaterialQuantity>

Represents a quantity of a material identified by item ID, resource type ID, and/or item tag. Used in crafting recipes and material requirements. Can be converted to an ItemStack or ResourceQuantity.

## Constants

- public static final MaterialQuantity[] EMPTY_ARRAY
- public static final BuilderCodec<MaterialQuantity> CODEC

## Methods

- public String getItemId()
- public String getResourceTypeId()
- public int getTagIndex()
- public int getQuantity()
- public BsonDocument getMetadata()
- public MaterialQuantity clone(int quantity)
- public ItemStack toItemStack()
- public ResourceQuantity toResource()
- public com.hypixel.hytale.protocol.MaterialQuantity toPacket()

Also in this package: Inventory, ItemContext, ItemPickupType, ItemStack, Metadata, ResourceQuantity

Complete API:
  public String getItemId()
  public String getResourceTypeId()
  public int getTagIndex()
  public int getQuantity()
  public BsonDocument getMetadata()
  public MaterialQuantity clone(int quantity)
  public ItemStack toItemStack()
  public ResourceQuantity toResource()
  public com.hypixel.hytale.protocol.MaterialQuantity toPacket()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final MaterialQuantity[] EMPTY_ARRAY
public static final BuilderCodec<MaterialQuantity> CODEC
protected String itemId
protected String resourceTypeId
protected String tag
protected int tagIndex
protected int quantity
protected BsonDocument metadata
