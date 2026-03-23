# Nameplate

Type: class | Package: com.hypixel.hytale.server.core.entity.nameplate | Implements: Component<EntityStore>

public class Nameplate implements Component<EntityStore>

## Fields

- @Nonnull public static final BuilderCodec<Nameplate> CODEC
- @Nonnull private String text
- private boolean isNetworkOutdated

## Constructors

- public Nameplate()
- public Nameplate(@Nonnull String text)

## Methods

- @Nonnull public static ComponentType<EntityStore, Nameplate> getComponentType()
- @Nonnull public String getText()
- public void setText(@Nonnull String text)
- public boolean consumeNetworkOutdated()
- @Nonnull @Override public Component<EntityStore> clone()

Also in this package: EntityTrackerRemove, EntityTrackerUpdate, NameplateSystems

Complete API:
  public static ComponentType<EntityStore,Nameplate> getComponentType()
  public String getText()
  public void setText(String text)
  public boolean consumeNetworkOutdated()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<Nameplate> CODEC
private String text
private boolean isNetworkOutdated
