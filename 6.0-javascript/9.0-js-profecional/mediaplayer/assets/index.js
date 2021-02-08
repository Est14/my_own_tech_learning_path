const video = document.querySelector("video")
      const button = document.querySelector("button")

      function MediaPlayer(config){
        this.media = config.el
      }

      MediaPlayer.prototype.play = function(){
        let status = this.media.paused
        console.log(status)
        if (status){
          this.media.play()
        }else{
          this.media.pause()
        }
        
      }
      
      const player = new MediaPlayer({el:video})
      button.onclick = () => player.play()
