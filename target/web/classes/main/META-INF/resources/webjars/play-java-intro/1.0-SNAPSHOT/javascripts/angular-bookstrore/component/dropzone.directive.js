angular.module('dropzone', []).directive('dropzone', function () {
    return function (scope, element, attrs) {
        var config, dropzone;

        config = scope[attrs.dropzone];

        // create a Dropzone for the element with the given options
        dropzone = new Dropzone(element[0], config.options);

        // bind the given event handlers
        angular.forEach(config.eventHandlers, function (handler, event) {
            dropzone.on(event, handler);
        });
    };
});

angular.module('dropzone.directive', ['dropzone']);

angular.module('dropzone.directive').controller('UploadCtrl', function ($scope) {
    $scope.dropzoneConfig = {
        'options': { // passed into the Dropzone constructor
            'url': '/upload'
        },
        'eventHandlers': {
            'sending': function (file, xhr, formData) {

                console.log(file);
                console.log(xhr);
                console.log(formData);
            },
            'success': function (file, response) {
                console.log("uploaded");
            }
        }
    };
});