Crud = Crud || {};

Crud.DialogoExcluir = (function() {
	function DialogoExcluir() {
		this.exclusaoBtn = $('.js-exclusao-btn')
	}
     
	DialogoExcluir.prototype.iniciar= function(){
		this.exclusaoBtn.on('click', onExcluirClicado.bind(this));
		
	}
	
	function onExcluirClicado(evento) {
		event.preventDefault();
		var botaoClicado = $(evento.currentTarget);
		var url = botaoClicado.data('url');
		var objeto = botaoClicado.data('objeto');
		
		swal({
			  title: "Tem certeza?",
			  text: 'Excluir "'+ objeto + '" esse funcionário',
			  showCancelButton: true,
			  confirmButtonColor: '#DD6B55',
			  confirmButtonText: 'Sim, exclua agora!',
			  CloseOnConfirm: false,
			}, onExcluirConfirmado.bind(this, url));
			
	}
	
	function onExcluirConfirmado(url) {
		console.log('url', url);
	}
	
	return DialogoExcluir;
}());

$(function() {
	var dialogo = new Crud.DialogoExcluir();
	dialogo.iniciar();
});