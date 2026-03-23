# PlaySoundPage

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages.audio | Extends: InteractiveCustomUIPage<PlaySoundPage.PlaySoundPageEventData>

public class PlaySoundPage extends InteractiveCustomUIPage<PlaySoundPage.PlaySoundPageEventData>

## Fields

- private static final String COMMON_TEXT_BUTTON_DOCUMENT
- private static final Value<String> BUTTON_LABEL_STYLE
- private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
- @Nonnull private String searchQuery
- private List<String> soundEvents
- @Nullable private String selectedSoundEvent
- private float volumeDecibels
- private float pitchSemitones

## Constructors

- public PlaySoundPage(@Nonnull PlayerRef playerRef)

## Methods

- @Override public void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull PlaySoundPage.PlaySoundPageEventData data)
- private void buildSoundEventList(@Nonnull Ref<EntityStore> ref,
        @Nonnull UICommandBuilder commandBuilder,
        @Nonnull UIEventBuilder eventBuilder,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `private` | `void` | `selectSoundEvent(@Nonnull Ref<EntityStore> ref,
        @Nonnull String soundEvent,
        @Nonnull UICommandBuilder commandBuilder,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

## Inner Types

- `PlaySoundPage.PlaySoundPageEventData`

Also in this package: PlaySoundPageEventData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, PlaySoundPage.PlaySoundPageEventData data)
  private void buildSoundEventList(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, ComponentAccessor<EntityStore> componentAccessor)
  private void selectSoundEvent(Ref<EntityStore> ref, String soundEvent, UICommandBuilder commandBuilder, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final String COMMON_TEXT_BUTTON_DOCUMENT
private static final Value<String> BUTTON_LABEL_STYLE
private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
private String searchQuery
private List<String> soundEvents
private String selectedSoundEvent
private float volumeDecibels
private float pitchSemitones
