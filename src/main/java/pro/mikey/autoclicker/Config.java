package pro.mikey.autoclicker;

public class Config {

    private final LeftMouseConfig leftClick;
    private final RightMouseConfig rightClick;

    public Config(LeftMouseConfig leftClick, RightMouseConfig rightClick) {
        this.leftClick = leftClick;
        this.rightClick = rightClick;
    }

    public LeftMouseConfig getLeftClick() {
        return this.leftClick;
    }

    public RightMouseConfig getRightClick() {
        return this.rightClick;
    }

    @Override
    public String toString() {
        return "Config{" +
                "leftClick=" + this.leftClick +
                ", rightClick=" + this.rightClick +
                '}';
    }

    public static class LeftMouseConfig extends SharedConfig {
        private boolean respectCooldown;
        private boolean mobMode;

        public LeftMouseConfig(boolean active, boolean spamming, int cpt, boolean respectCooldown, boolean mobMode) {
            super(active, spamming, cpt);

            this.respectCooldown = respectCooldown;
            this.mobMode = mobMode;
        }

        public boolean isRespectCooldown() {
            return this.respectCooldown;
        }

        public void setRespectCooldown(boolean respectCooldown) {
            this.respectCooldown = respectCooldown;
        }

        public boolean isMobMode() {
            return this.mobMode;
        }

        public void setMobMode(boolean mobMode) {
            this.mobMode = mobMode;
        }
    }

    public static class RightMouseConfig extends SharedConfig {
        public RightMouseConfig(boolean active, boolean spamming, int cpt) {
            super(active, spamming, cpt);
        }
    }

    public static class SharedConfig {
        private boolean active;
        private boolean spamming;
        private int cpt;

        public SharedConfig(boolean active, boolean spamming, int cpt) {
            this.active = active;
            this.spamming = spamming;
            this.cpt = cpt;
        }

        public boolean isActive() {
            return this.active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public boolean isSpamming() {
            return this.spamming;
        }

        public void setSpamming(boolean spamming) {
            this.spamming = spamming;
        }

        public int getCpt() {
            return this.cpt;
        }

        public void setCpt(int cpt) {
            this.cpt = cpt;
        }

        @Override
        public String toString() {
            return "SharedConfig{" +
                    "active=" + this.active +
                    ", spamming=" + this.spamming +
                    ", cpt=" + this.cpt +
                    '}';
        }
    }
}
