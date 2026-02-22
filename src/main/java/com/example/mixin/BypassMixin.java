@Mixin(ClientPlayerEntity.class)
public abstract class BypassMixin {
    @Inject(method = "sendMovementPackets", at = @At("HEAD"))
    private void onUpdate(CallbackInfo ci) {
        // Logic: If entity is in range, spoof the rotation packet
        // without moving the player's actual screen.
    }
}
