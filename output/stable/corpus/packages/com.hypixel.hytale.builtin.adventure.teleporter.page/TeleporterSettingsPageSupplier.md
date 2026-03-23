# TeleporterSettingsPageSupplier

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.page | Implements: OpenCustomUIInteraction.CustomPageSupplier

public class TeleporterSettingsPageSupplier implements OpenCustomUIInteraction.CustomPageSupplier

Supplier that creates TeleporterSettingsPage instances from block interactions.

Also in this package: Mode, PageEventData, TeleporterSettingsPage

Complete API:
  public CustomUIPage tryCreate(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, PlayerRef playerRef, InteractionContext context)

Fields:
public static final BuilderCodec<TeleporterSettingsPageSupplier> CODEC
private boolean create
private TeleporterSettingsPage.Mode mode
