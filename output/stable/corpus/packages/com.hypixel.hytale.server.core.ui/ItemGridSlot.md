# ItemGridSlot

Type: class | Package: com.hypixel.hytale.server.core.ui

public class ItemGridSlot

## Fields

- public static final BuilderCodec<ItemGridSlot> CODEC
- private ItemStack itemStack
- private Value<PatchStyle> background
- private Value<PatchStyle> overlay
- private Value<PatchStyle> icon
- private boolean isItemIncompatible
- private String name
- private String description
- private boolean skipItemQualityBackground
- private boolean isActivatable
- private boolean isItemUncraftable

## Constructors

- public ItemGridSlot()
- public ItemGridSlot(ItemStack itemStack)

## Methods

- @Nonnull public ItemGridSlot setItemStack(ItemStack itemStack)
- @Nonnull public ItemGridSlot setBackground(Value<PatchStyle> background)
- @Nonnull public ItemGridSlot setOverlay(Value<PatchStyle> overlay)
- @Nonnull public ItemGridSlot setIcon(Value<PatchStyle> icon)
- @Nonnull public ItemGridSlot setItemIncompatible(boolean itemIncompatible)
- @Nonnull public ItemGridSlot setName(String name)
- @Nonnull public ItemGridSlot setDescription(String description)
- public boolean isItemUncraftable()
- public void setItemUncraftable(boolean itemUncraftable)
- public boolean isActivatable()
- public void setActivatable(boolean activatable)
- public boolean isSkipItemQualityBackground()
- public void setSkipItemQualityBackground(boolean skipItemQualityBackground)

Also in this package: Anchor, Area, DropdownEntryInfo, LocalizableString, LocalizableStringCodec, PatchStyle, Value, ValueCodec

Complete API:
  public ItemGridSlot setItemStack(ItemStack itemStack)
  public ItemGridSlot setBackground(Value<PatchStyle> background)
  public ItemGridSlot setOverlay(Value<PatchStyle> overlay)
  public ItemGridSlot setIcon(Value<PatchStyle> icon)
  public ItemGridSlot setItemIncompatible(boolean itemIncompatible)
  public ItemGridSlot setName(String name)
  public ItemGridSlot setDescription(String description)
  public boolean isItemUncraftable()
  public void setItemUncraftable(boolean itemUncraftable)
  public boolean isActivatable()
  public void setActivatable(boolean activatable)
  public boolean isSkipItemQualityBackground()
  public void setSkipItemQualityBackground(boolean skipItemQualityBackground)

Fields:
public static final BuilderCodec<ItemGridSlot> CODEC
private ItemStack itemStack
private Value<PatchStyle> background
private Value<PatchStyle> overlay
private Value<PatchStyle> icon
private boolean isItemIncompatible
private String name
private String description
private boolean skipItemQualityBackground
private boolean isActivatable
private boolean isItemUncraftable
