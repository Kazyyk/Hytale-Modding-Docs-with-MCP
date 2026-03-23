# FilterType

Type: enum | Package: com.hypixel.hytale.server.core.inventory.container.filter

public enum FilterType

Global container filter controlling whether input (add) and output (remove) operations are permitted.

## Enum Constants

- ALLOW_INPUT_ONLY | Yes | No
- ALLOW_OUTPUT_ONLY | No | Yes
- ALLOW_ALL | Yes | Yes
- DENY_ALL | No | No

## Methods


public boolean allowInput()

Returns `true` if items may be added to the container.


public boolean allowOutput()

Returns `true` if items may be removed from the container.

Also in this package: ArmorSlotAddFilter, FilterActionType, ItemSlotFilter, NoDuplicateFilter, ResourceFilter, SlotFilter, TagFilter

Complete API:
  public boolean allowInput()
  public boolean allowOutput()

Fields:
public static final Codec<FilterType> CODEC
private final boolean input
private final boolean output
