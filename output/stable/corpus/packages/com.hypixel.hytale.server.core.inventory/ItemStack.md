# ItemStack

Type: class | Package: com.hypixel.hytale.server.core.inventory | Implements: NetworkSerializable<ItemWithAllMetadata>

public class ItemStack implements NetworkSerializable<ItemWithAllMetadata>

Represents a quantity of a specific item, with durability tracking and optional BSON metadata. Instances are immutable-by-convention: mutating methods like `withQuantity()` and `withDurability()` return new instances. Supports codec-based serialization and network packet conversion.

## Constants

- public static final ItemStack[] EMPTY_ARRAY
- public static final BuilderCodec<ItemStack> CODEC
- public static final ItemStack EMPTY

## Constructors

- ItemStack(String itemId, int quantity, BsonDocument metadata)
- ItemStack(String itemId, int quantity, double durability, double maxDurability, BsonDocument metadata)
- ItemStack(String itemId)
- ItemStack(String itemId, int quantity)

## Methods

- public String getItemId()
- public int getQuantity()
- public BsonDocument getMetadata()
- public boolean isUnbreakable()
- public boolean isBroken()
- public double getMaxDurability()
- public double getDurability()
- public boolean isEmpty()
- public boolean getOverrideDroppedItemAnimation()
- public void setOverrideDroppedItemAnimation(boolean b)
- public String getBlockKey()
- public Item getItem()
- public boolean isValid()
- public ItemStack withDurability(double durability)
- public ItemStack withMaxDurability(double maxDurability)
- public ItemStack withIncreasedDurability(double inc)
- public ItemStack withRestoredDurability(double maxDurability)
- public ItemStack withState(String state)
- public ItemStack withQuantity(int quantity)
- public ItemStack withMetadata(BsonDocument metadata)
- public <T> ItemStack withMetadata(KeyedCodec<T> keyedCodec, T data)
- public <T> ItemStack withMetadata(String key, Codec<T> codec, T data)
- public ItemStack withMetadata(String key, BsonValue bsonValue)
- public ItemWithAllMetadata toPacket()
- public boolean isStackableWith(ItemStack itemStack)
- public boolean isEquivalentType(ItemStack itemStack)
- public <T> T getFromMetadataOrNull(KeyedCodec<T> keyedCodec)
- public <T> T getFromMetadataOrNull(String key, Codec<T> codec)
- public <T> T getFromMetadataOrDefault(String key, BuilderCodec<T> codec)
- public static boolean isEmpty(ItemStack itemFrom)
- public static boolean isStackableWith(ItemStack a, ItemStack b)
- public static boolean isEquivalentType(ItemStack a, ItemStack b)
- public static boolean isSameItemType(ItemStack a, ItemStack b)
- public static ItemStack fromPacket(ItemQuantity packet)

## Inner Types

- ItemStack.Metadata | class | Contains the `BLOCK_STATE` metadata key constant

Also in this package: Inventory, ItemContext, ItemPickupType, MaterialQuantity, Metadata, ResourceQuantity

Complete API:
  public String getItemId()
  public int getQuantity()
  public BsonDocument getMetadata()
  public boolean isUnbreakable()
  public boolean isBroken()
  public double getMaxDurability()
  public double getDurability()
  public boolean isEmpty()
  public boolean getOverrideDroppedItemAnimation()
  public void setOverrideDroppedItemAnimation(boolean b)
  public String getBlockKey()
  public Item getItem()
  public boolean isValid()
  public ItemStack withDurability(double durability)
  public ItemStack withMaxDurability(double maxDurability)
  public ItemStack withIncreasedDurability(double inc)
  public ItemStack withRestoredDurability(double maxDurability)
  public ItemStack withState(String state)
  public ItemStack withQuantity(int quantity)
  public ItemStack withMetadata(BsonDocument metadata)
  public ItemStack withMetadata(KeyedCodec<T> keyedCodec, T data)
  public ItemStack withMetadata(String key, Codec<T> codec, T data)
  public ItemStack withMetadata(String key, BsonValue bsonValue)
  public ItemWithAllMetadata toPacket()
  public boolean isStackableWith(ItemStack itemStack)
  public boolean isEquivalentType(ItemStack itemStack)
  public T getFromMetadataOrNull(KeyedCodec<T> keyedCodec)
  public T getFromMetadataOrNull(String key, Codec<T> codec)
  public T getFromMetadataOrDefault(String key, BuilderCodec<T> codec)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static boolean isEmpty(ItemStack itemFrom)
  public static boolean isStackableWith(ItemStack a, ItemStack b)
  public static boolean isEquivalentType(ItemStack a, ItemStack b)
  public static boolean isSameItemType(ItemStack a, ItemStack b)
  public static ItemStack fromPacket(ItemQuantity packet)

Fields:
public static final ItemStack[] EMPTY_ARRAY
public static final BuilderCodec<ItemStack> CODEC
public static final ItemStack EMPTY
protected String itemId
protected int quantity
protected double durability
protected double maxDurability
protected boolean overrideDroppedItemAnimation
protected BsonDocument metadata
private ItemWithAllMetadata cachedPacket
